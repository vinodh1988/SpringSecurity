package com.model.jobs;

public class JobsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Jobs j=new Jobs("SE","SoftWare Engineer",10000,30000);
		if(JobsDAO.insert(j))
			System.out.println("Record Inserted");
		else
			System.out.println("Record Not inserted");*/
		
		for(Jobs x:JobsDAO.getJobs()){
			System.out.println(x.getJob_id()+" "+x.getJob_title());
		}
	}

}
