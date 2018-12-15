import java.io.*;

	
  //Input username and password from the user....................
class inputname
{

	 void input()
	 {
		int check=0;
		String s1="",s2="",s3="",s4="";
		File fout=null,fout1=null;
		FileReader fr=null,f1=null;
		BufferedReader br=null,br1=null,br2=null;

		try
		{
			fout=new File("user.txt");
			fr=new FileReader(fout);
			br=new BufferedReader(fr);

			//s1=br.readLine();

			System.out.print("Enter your username :-");
			br1=new BufferedReader(new InputStreamReader(System.in));

			s2=br1.readLine();

			fout1=new File("password.txt");
			FileReader fr1=new FileReader(fout1);
			br2=new BufferedReader(fr1);

			//s3=br2.readLine();

			System.out.print("Enter your Password :-");
			br1=new BufferedReader(new InputStreamReader(System.in));

			s4=br1.readLine();
			do
			{	
				s1=br.readLine();
				s3=br2.readLine();
				if(s1==null||s3==null) break;
				if(s1.equals(s2)&&s3.equals(s4))
				{
					System.out.println("Successfully loged in ");
					check++;
					
					//String[] args={};
					Createfile cf=new Createfile();
						cf.main();
					
					break;
				}
				
			}while(!(s1==null&&s3==null));
			if(check==0)
				{
					System.out.println("Invalid username or password ......");
				}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	 }
}

       
	   //Creating for New account......................... 

class inputcreate

	{
         void create() throws Exception
		     {
				File fout1=new File("password.txt");
			    FileReader fr1=new FileReader(fout1);
			    BufferedReader br2=new BufferedReader(fr1);
				String s3=br2.readLine();

			    System.out.print("\tBefore creating your new account you must have input Administrator password :-");
				BufferedReader bm=new BufferedReader(new InputStreamReader(System.in));
				String sg=bm.readLine();
				if(s3.equals(sg))
				 {
			    System.out.println("\ncreate new account in your exixting file:\n");
				//File fout=null,fout1=null;
                //fout=new File("user.txt");
	            //fout1=new File("password.txt");
			
			    String filename= "user.txt";
                FileWriter fw = new FileWriter("user.txt",true);
				PrintWriter pr=new PrintWriter(fw,true);
				System.out.print("Enter New User Name :-");
				BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
                String se=bu.readLine();
				pr.println(se);
				fw.close();




				String filename1="password.txt";
				FileWriter fw1=new FileWriter("password.txt",true);
				PrintWriter pw=new PrintWriter(fw1,true);
				System.out.print("Enter Your new password :-");
				BufferedReader bu1=new BufferedReader(new InputStreamReader(System.in));
				String sw=bu1.readLine();
				pw.println(sw);
                fw1.close();
				 }
				 else
				 {
					 System.out.println("Your Administrator password is incorrect......");
				 }
		     }
	}
          //  Main class...................

class UserPassword 
{
		public static void main(String[] args) throws Exception
		 {
			String ch="";
			do
			{
				
				int x;
				System.out.println("\t1. Log in your acconut :\n");
                System.out.println("\t2. Create your new account :\n");
				System.out.println("Input Your choice............. :");
                BufferedReader bu2=new BufferedReader(new InputStreamReader(System.in));
                x=Integer.parseInt(bu2.readLine());
                switch(x)
				{
					case 1:
						inputname un=new inputname();
			            un.input();
						break;
                    
					case 2:
                        inputcreate uc=new inputcreate();
				        uc.create();
						break;

                    default:
                        System.out.println("You have entered wrong choice.......:");
                        System.out.println("Do you want to continue......press  yes  or press any key to exit :");
                        BufferedReader bu3=new BufferedReader(new InputStreamReader(System.in));
						ch=bu3.readLine();
						break;
						
			     }
			}while(ch.equals("yes"));
		 }
}
			
		    
            
		   
           
           
		   
