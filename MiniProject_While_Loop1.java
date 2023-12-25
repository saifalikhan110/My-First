import java.util.*;

class MiniProject_While_Loop{
	
	public static void main(String args[]){
		
		Scanner ob=new Scanner(System.in);
		
		
		char ch='y';
		
		
		back:
		
		
		while(ch=='y'||ch=='Y'){
			
			
				
			System.out.print("1:Calculator \n2:Unit Convertor\n3:Marksheet\n4:Table\n5:Exit\n");
		System.out.print("Enter Selection : ");
					int sel=ob.nextInt();
			
		while(sel==1){
				my:
			
				while(true){
				
					System.out.print("1:Simple Calculator \n2:Operator Calculator \n3:Back\n");
					System.out.print("Enter Selection : ");
					int s1=ob.nextInt();
				
					if(s1==1){
								
							
						System.out.print("1:Addition \n2:Subtraction \n3:Multiplication \n4:Division\n5:Reminder\n6:Back\n");
						System.out.print("Enter Selection");
						int s2=ob.nextInt();
					
					
						if(s2==1){
						
							System.out.println("==============================");
							System.out.println("-------ADDITION-------");
							System.out.print("Enter Num 1 :");
							int num1=ob.nextInt();
							System.out.print("Enter Num 2 :");
							int num2=ob.nextInt();
							System.out.println("Addition is :"+(num1+num2));
							System.out.println("==============================");
						
						
						
											
						}
						
						if(s2==2){
							System.out.println("==============================");
							System.out.println("-------SUBTRACTION-------");
								System.out.print("Enter Num 1 :");
							    int num1=ob.nextInt();
								System.out.print("Enter Num 2 :");
								int num2=ob.nextInt();
								System.out.println("Subtraction is :"+(num1-num2));
								System.out.println("==============================");
						}
						
						if(s2==3){
						System.out.println("==============================");
						
						System.out.println("-------MULTIPLICATION-------");
						
								System.out.print("Enter Num 1 :");
							    int num1=ob.nextInt();
								System.out.print("Enter Num 2 :");
								int num2=ob.nextInt();
								System.out.println("Multiplication is :"+(num1*num2));
								System.out.println("==============================");
						}
						
						if(s2==4){
								System.out.println("==============================");
								System.out.println("-------DIVISION-------");
								System.out.print("Enter Num 1 :");
							    int num1=ob.nextInt();
								System.out.print("Enter Num 2 :");
								int num2=ob.nextInt();
						
								System.out.println("Division is :"+(num1/num2));
								System.out.println("==============================");
							
						}
						if(s2==5){
							System.out.println("==============================");
							System.out.println("-------REMINDER-------");
							
							
							
							System.out.print("Enter Num 1 :");
							    int num1=ob.nextInt();
								System.out.print("Enter Num 2 :");
								int num2=ob.nextInt();
							
							System.out.println("Reminder is :"+(num1%num2));
							System.out.println("==============================");
						}
						
						if(s2==6){
							
							continue my;
						}
						
						if(s2<=0||s2>6){
							
							System.out.println("------Invalid Selection Please Try Again------");
						}
						
						
					}//simple Cal
					
					
					else 
						if (s1==2){
						
						System.out.print("Enter value 1 :");
						int val1=ob.nextInt();
						System.out.print("Enter value 2 :");
						int val2=ob.nextInt();
						System.out.print("Enter Operator");
						
						char op=ob.next().charAt(0);
						if(op=='+'){
							
							System.out.println("Addition is :"+(val1+val2));
						}
						
						else if(op=='-'){
							
							System.out.println("Subtraction is :"+(val1-val2));
						}
						
						else if(op=='*'){
							
							System.out.println("Multiplication is :"+(val1*val2));
						}
						
					else	if(op=='/'){
							
							System.out.println("Division is :"+(val1/val2));
						}
						
						else if(op=='%'){
							
							System.out.println("Reminder  is :"+(val1%val2));
						}
						
						else{
							
							System.out.println("-----Invalid Operator-------");
						}
						
						
							
								
					}// op cal
					
					else 
						if(s1==3){

						
						continue back;
					}
					
					else{
						
						
						System.out.println("------Invalid Selection Please Try Again------");
						
					}
						
					
				}//Calculator
			}
			
				
			while(sel==2){
				
			while(true){
			System.out.println("1:Kilo to Gram \n2:Gram to Kilo \n3:Feet to inch \n4:Inch to Feet \n5:Back\n ");
			
			
			System.out.print("Enter Selection : ");
			int s3=ob.nextInt();
			
			if(s3==1){
						System.out.println("==============================");
				
						System.out.print("Enter Kilo ");
						int kilo=ob.nextInt();
						
						int gram=kilo*1000;
						
						System.out.println("Grams will be "+gram);
						
						System.out.println("==============================");

						
			}
			else 
				if(s3==2){
				
						System.out.println("==============================");

				
						System.out.print("Enter Grams");
						int gram=ob.nextInt();
						
						int kilo=gram/1000;
						
						System.out.println("Kilo  will be "+kilo);
						
					System.out.println("==============================");

						
			}
			else
				if(s3==3){
						System.out.println("==============================");
						System.out.print("Enter Feet ");
						int feet=ob.nextInt();
						
						int inches=feet*12;
						
						System.out.println("Inches will be "+inches);
						System.out.println("==============================");
			}
			
		else
			if(s3==4){
						System.out.println("==============================");
						System.out.print("Enter inches ");
						int inches=ob.nextInt();
						
						int feet=inches/12;
						
						System.out.println("Feet will be "+feet);
						
						System.out.println("==============================");
			}
			
			
			
			else
				if(s3==5){
				
				continue back;
			}
			
			else{
				System.out.println("--------Invalid Selection--------");
			}

				
			}
				
			}
			
			
			while(sel==3){
				
				
				while(true){
			
					
					System.out.println("=============");
						
						Marksheet.main(args);
						System.out.println("=============");
						
							System.out.print("1 Continue :Marksheet \n2:Back to Main Menu\n");
					System.out.print("Enter Selection ");
					int s4=ob.nextInt();
					if(s4==1){
						
						System.out.println("=============");
						
						Marksheet.main(args);
						System.out.println("=============");
					}
					else if(s4==2){
						
						continue back;
					}
					else{
						System.out.println("-----------Invalid Selection Please Try Again-----------");
					}
				}
			}
				
		

			while(sel==4){
				
				
				table :
				while(true){
					
					
					
					System.out.print("Enter table No :");
						int table=ob.nextInt();
		
						System.out.print("Enter counter No :");
						int counter=ob.nextInt();
							int i=1;
						System.out.print("==================================\n");
						while(i<=counter){
			
						System.out.println(table+"x"+i+"="+table*i);
			
						i++;
						}
						System.out.print("==================================\n");
						
						
					System.out.print("1:Table  \n2:Back\n");
					System.out.print("Enter Selection ");
					int s5=ob.nextInt();
					
					if(s5==1){
						
						continue table;
						
						
					}
					
					else if(s5==2){
						
						continue back;
					}
					
					else{
							System.out.println("-------Invalid Selection-------");
					}
				}
				
				
			}
				
	
			while(sel==5){
				
				
				
				
				
				System.out.println("Good bye");
				
				ch='N';
				break;
			}

		}
		}
}
