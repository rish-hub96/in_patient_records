package com.cts.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.InPatient;

@WebServlet("/InPatientController")
public class InPatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InPatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
		// TODO Auto-generated method stub
    	InPatient inpatient = new InPatient();
    	
    	inpatient.setPatient_name(request.getParameter("patient_name"));
    	
    	System.out.println(inpatient.getPatient_name());
    	
        inpatient.setAge(Integer.parseInt(request.getParameter("patient_age")));
    	
    	System.out.println(inpatient.getAge());
    	
        inpatient.setPatient_type(request.getParameter("patientType"));
    	
    	System.out.println(inpatient.getPatient_type());
    	
           inpatient.setGender(request.getParameter("gender"));
    	
    	System.out.println(inpatient.getGender());
    	
        inpatient.setOpno(request.getParameter("opno"));
    	
    	System.out.println(inpatient.getOpno());
    	
         inpatient.setDiagnosis(request.getParameter("paragraph_text"));
    	
    	System.out.println(inpatient.getDiagnosis());
    	
        
    	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
