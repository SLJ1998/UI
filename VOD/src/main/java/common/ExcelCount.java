package common;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExcelCount {
    private static String filepath="src\\test\\java\\data";

    public static List<String> get_all_name(String file_path){
        List<String> list=new ArrayList<String>();
        File file=new File(file_path);
        File[] files=file.listFiles();
        for(File f:files){
            if(f.isDirectory())
                list.addAll(get_all_name(f.getPath()));
            String name=f.getName();
            if(name.indexOf("xls")!=-1){
                list.add(name);
            }
        }
        return list;
    }
    public int fileRows(String filepath,String fileName)throws IOException{

        FileInputStream inputStream = new FileInputStream(new File(filepath + "\\" + fileName));
        Workbook Workbook = null;
        //获取文件扩展名
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        //判断是.xlsx还是.xls的文件并进行实例化
        if(fileExtensionName.equals(".xlsx")){
            Workbook = new XSSFWorkbook(inputStream);
        }
        else if(fileExtensionName.equals(".xls")){
            Workbook = new HSSFWorkbook(inputStream);
        }
        int rows=0;
        for (int i = 0; i < Workbook.getNumberOfSheets(); i++) {
            Sheet sheet = Workbook.getSheetAt(i);
            //行数
            int row = sheet.getLastRowNum();
            rows+=row;
        }
        System.out.println("当前行数" + rows);
        return rows;
    }
    public static void main(String[] args) throws IOException {
        ArrayList<String> filenames= (ArrayList<String>) ExcelCount.get_all_name(filepath);
        System.out.println(filenames);
        ExcelCount excelCount=new ExcelCount();
        int countall=0;
        for (int i=0;i<filenames.size();i++){
            System.out.println("当前表格："+filenames.get(i));
            int filecount=excelCount.fileRows(filepath,filenames.get(i));
            countall+=filecount;
        }
        System.out.println("------------------\n表格总行数:"+countall);
    }
}
