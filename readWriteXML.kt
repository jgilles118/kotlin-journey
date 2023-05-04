package com.developersoapbox

import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.xssf.usermodel.XSSFWorkbook
import java.io.FileInputStream
import java.io.FileOutputStream


//Will insert the string "Test" in column:row A1:01
fun insertToExcel(filepath: Strint){
    //Create Excel workbook
    val xlwb = XSSFWorkbook()
    //Create Excel worksheet
    val xlws = xlwb.createSheet()

    //Row 0 of the spreadsheet
    val rowNum = 0
    //Column 0 (column A1) of the spreadsheet
    val columnNum = 0

    //Create the string "Test" to be inserted into the cell
    xlws.createRow(rowNum).createCell(columnNum).setCellValue("Test")

    //Write to the sheet
    val outputStream = FileOutputStream(filepath)
    xlwb.write.(outputStream)
    xlwb.close()
}

//Read the input from excel
fun readFromExcelFile(filepath: String){
    val inputStream = FileInputStream(filepath)
    //Create an excel workbook using an existing file
    val xlwb = WorkbookFactory.create(inputStream)

    //Create row 0
    val rowNum = 0
    //Column 0 (column A1) of the spreadsheet
    val columnNum = 0

    //Get the reference
    val xlws = xlwb.getSheetAt(0)
    println(xlws.getRow(rowNum).getCell(columnNum)
}

fun main(args: Array<String>){
    val filepath = "./test.xlsx"
    writeToExcelFile(filepath)
    readFromExcelFile(filepath)
}
