package com.main;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.model.RawData;
import com.poc.GetContent;


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
        
        //GetContent.getContent();
		InsertData insertData = new InsertData();
		List<RawData> rawDatas = new ArrayList<>();
		rawDatas = insertData.retrieve();
		
		System.out.println(rawDatas.size());
		for (RawData rawData : rawDatas) {
			System.out.println(rawData.getCompany());
		}
	}
}
