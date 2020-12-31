        import java.util.Scanner;
        import java.lang.Math;
        class calcu
        {
        double add(double a,double b)
        {
        double sum=a+b;
        return sum;
        }
        double sub(double a, double b)
        {
        double minus=a-b;
        return minus;
        }
        double div(double a,double b)
        {
        double di=a/b;
        return di;
        }
        double multi(double a,double b)
        {
        double mul=a*b;
        return mul;
        }
        double sqroot(double a)
        {
        double root=Math.sqrt(a);
        return root;
        }
        double croot(double a)
        { 
        double crot=Math.pow(a,1/3);
        return crot;
        }
        }

        class NcrAndNpr
            {
	                double fact(int n1)
	                {
	                   int i=1;
                             	    double fact=1;
	                    while(i<=n1)
	                    {
	                   	   fact=fact*i;
		                   i++;
                 	    }
                  	      return fact;
	                }
	                double permutation(int n1,int r1 )
	                {
		                double per=fact(n1)/fact(n1-r1);	
		                return per;
	                }
	                double combination(int n1,int r1)
	                {
		                double com=fact(n1)/(fact(n1-r1)*fact(r1));
		                return com;
	                }
             }

        class main
        {
        public static void main(String arg[])
        {
        double a,b,q,r,e,f,g,h,i,j,A,B,C,D,E,F;
        int ch,m, n, c,d;
        System.out.println("This is our mini project");
        Scanner sc=new Scanner(System.in);

               do
             {

                System.out.print("\t\t\t\t\n\nMenu\t\n1.addition\t\n2.subtractio\t\n3.division");
                System.out.print("\t\n4.Multplication\t\n5.square root \t\n6.cube root");
                System.out.print("\t\n7.Addtion of matrix");
                System.out.print("\n8.Roots of a quadratic equation");
                System.out.print("\t\n9.Enter n and p for npr and ncr calculation\t\n10.Exit\t\nEnter your choice\n");
                ch=sc.nextInt();
                calcu ob=new calcu();
                
                        
                switch(ch)
                {
                case 1:
                System.out.println("Enter two Numbers");
                a=sc.nextDouble();
                b=sc.nextDouble();
                A=ob.add(a,b);
                System.out.println("addition of two numbers "+A);
                break;           
                case 2:
                System.out.println("Enter two Numbers");
                q=sc.nextDouble();
                r=sc.nextDouble();
                B=ob.sub(q,r);
                System.out.println("Subtraction of two numbers "+B);
                break;
                case 3:
                System.out.println("Enter two Numbers");
                e=sc.nextDouble();
                f=sc.nextDouble();
                C=ob.div(e,f);
                System.out.println("Division of two numbers is "+C);
                break;
                case 4:
                System.out.println("Enter two Numbers");
                g=sc.nextDouble();
                h=sc.nextDouble();
                D=ob.multi(g,h);
                System.out.println("Multiplication of two numbers"+D);
                break;
                case 5:
                System.out.println("Enter the number for calculation of square root");
                i=sc.nextDouble();
                E=ob.sqroot(i);
                System.out.println("Square root of the number is "+E);
                break;
                case 6:
                System.out.println("Enter the number for cube root");
                j=sc.nextDouble();
                F=ob.croot(j);
                System.out.println("Cube root of the number is "+F);
                break;
                case 7:
                System.out.println("Enter the number of rows and columns of matrix");
                m = sc.nextInt();
                n = sc.nextInt();
                int first[][] = new int[m][n];
                int second[][] = new int[m][n];
                int sum[][] = new int[m][n];
             
                System.out.println("Enter the elements of first matrix");
             
                for (c = 0; c < m; c++)
                for (d = 0; d < n; d++)
                    first[c][d] = sc.nextInt();
                   
                System.out.println("Enter the elements of second matrix");
             
                for (c = 0 ; c < m ; c++)
                for (d = 0 ; d < n ; d++)
                    second[c][d] = sc.nextInt();
                   
                for (c = 0; c < m; c++)
                for (d = 0; d < n; d++)
                sum[c][d] = first[c][d] + second[c][d]; 
                 System.out.println("Sum of the matrices:");
                     
                      for (c = 0; c < m; c++)
                    {
                         for (d = 0; d < n; d++)
                       {
                             System.out.print(sum[c][d]+"\t");
                         }
                            System.out.println();
                    }
               break;
              /* case 8:
                 int s,t,addition=0,v,w,x,y,k;

                 System.out.println("Enter the number of rows and columns of first matrix");
                  m = sc.nextInt();
                  n= sc.nextInt();
             
                  int fi[][] = new int[v][w];
             
                  System.out.println("Enter elements of first matrix");
             
                  for (s = 0; s < v; t++)
                     for (t = 0; t < w; t++)
                        fi[s][t] = sc.nextInt();
             
                  System.out.println("Enter the number of rows and columns of second matrix");
                  x = sc.nextInt();
                  y = sc.nextInt();
             
                  if (n != x)
                     System.out.println("The matrices can't be multiplied with each other.");
                  else
                  {
                     int se[][] = new int[x][y];

                     System.out.println("Enter elements of second matrix");
             
                     for (s = 0; s < x; s++)
                        for (t = 0; t < y; t++)
                           second[s][t] = sc.nextInt();
                           int m[][] = new int[v][y];
             
             
                     for (s = 0; s < v; s++)
                     {
                        for (t = 0; t < y; t++)
                        {  
                           for (k = 0; k < x; k++)
                           {
                              addition = addition + first[s][k]*second[k][t];
                           }
             
                           m[s][t] = addition;
                           addition = 0;
                        }
                     }
             
                     System.out.println("Product of the matrices:");
                   }
             
                     for (s = 0; s < v; s++)
                     {
                      {
                       for (t = 0; t < y; t++)
                           System.out.println(multiply[s][t]+"\t");
             
                        System.out.print("\n");
                         }
                   }
                          
            break;
*/
              
            case 8:
           double ab,bc,de;
           double root1, root2;
            System.out.println("Enter the coffcient of Quadratic equation");
            ab=sc.nextDouble();
            bc=sc.nextDouble();
            de=sc.nextDouble();
        double determinant = bc * bc - 4 * ab * de;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-bc + Math.sqrt(determinant)) / (2 * ab);
            root2 = (-bc - Math.sqrt(determinant)) / (2 * ab);

            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -bc / (2 * ab);

            System.out.format("root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else {
            double realPart = -bc / (2 *ab);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * ab);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
         }
       
        case 9:
                    double answ1,answ2;

                    NcrAndNpr po=new NcrAndNpr( );
                  
		            System.out.println("enter value of n1");
                           	int n1=sc.nextInt();
		            System.out.println("enter value of r1");
                          		int r1=sc.nextInt();
                      answ1=po.permutation(n1,r1);
                       answ2=po.combination(n1,r1);
		            if(n1>=r1)
		            {
		            System.out.println("The value of npr= "+answ1);	
		            System.out.println("The value of ncr= "+answ2);
		            }
		            else
		            System.out.println("n1 value should be greater than or equals to r1 value");
		  break;
          case 10:
          System.exit(0);
          break;
          default:
          break;
	            }	
              }
             
        
          
              while(ch!=0);
      }
     }


              
        


