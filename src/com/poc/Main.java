package com.main;

import java.io.File;
import java.util.List;

import com.mttr.model.Serpo;
import com.mttr.util.Datapool;


public class Main {

	public static void main(String[] args) {
		/*// first, we init the runtime engine.  Defaults are fine. 

        Velocity.init();

         //lets make a Context and put data into it 

        VelocityContext context = new VelocityContext();

        context.put("name", "Velocity");
        context.put("project", "Jakarta");

        // lets render a template 

        StringWriter w = new StringWriter();

        Velocity.mergeTemplate("/template/template.vm", context, w );
        System.out.println(" template : " + w );

        // lets make our own string to render 

        String s = "We are using $project $name to render this.";
        w = new StringWriter();
        Velocity.evaluate( context, w, "mystring", s );
        System.out.println(" string : " + w );*/
        
        //GetContent.getContent(new File("source/test.xls"));
		/*InsertData insertData = new InsertData();
		List<RawData> rawDatas = new ArrayList<>();
		rawDatas = insertData.retrieve();
		
		System.out.println(rawDatas.size());
		for (RawData rawData : rawDatas) {
			System.out.println(rawData.getCompany());
		}*/
		
		/*JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		jFrame.add(new Chart());
		jFrame.setSize(300, 200);*/
        
		//System.out.println(ExcelData.getRawDataFromExcel(new File("source/test.xls")));
		//System.out.println(ExcelData.processingRawData(ExcelData.getRawDataFromExcel(new File("source/test.xls"))));
		/*for (String string : ExcelData.processingRawData(ExcelData.getRawDataFromExcel(new File("source/test.xls")))) {
			System.out.println(string);
		}*/
		
		//ExcelData.insertData(new File("source/test.xls"));
	}
}
