import java.util.Scanner;
public class Worker {
    double totalHours;
    double totalPay;
    double payRate;
    double otPay;
    int skillLevel;
    double totalRetirment;
    boolean medicalInsurance;
    boolean dentalInsurance;
    boolean disInsurance;
    boolean retirement;

    public void getPay()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("___WELCOME___");
        System.out.println("");
        System.out.print("ENTER SKILL LEVEL (1-3): ");
        int tempVar = 0;
        if(in.hasNextInt())
        {
            tempVar = in.nextInt();
            skillLevel = tempVar;
            System.out.println("");
        }
        else
        {
            System.out.println("INVALID INPUT");
            System.out.println("");
        }
        switch(tempVar)
        {
            case 1:
                payRate = 17.00;
                otPay = 17 * 1.5;
                break;
            case 2:
                payRate = 20.00;
                otPay = 20 * 1.5;
                break;
            case 3:
                payRate = 22.00;
                otPay = 22 * 1.5;
                break;
            default:
                System.out.println("INVALID INPUT");
                break;
        }
    }

    public void getBenefits()
    {
        Scanner in = new Scanner(System.in);
        String tempvar;
        if(skillLevel == 2 || skillLevel == 3)
        {
            System.out.print("MEDICAL INSURANCE (YES/NO): ");
            tempvar = in.nextLine().trim();
            if(tempvar.toLowerCase().equals("yes"))
            {
                medicalInsurance = true;
            }
            else
            {
                medicalInsurance = false;
            }
            System.out.println("");
            System.out.print("Dental INSURANCE (YES/NO): ");
            tempvar = in.nextLine().trim();
            if(tempvar.toLowerCase().equals("yes"))
            {
                dentalInsurance = true;
            }
            else
            {
                dentalInsurance = false;
            }
            System.out.println("");
            System.out.print("Disability INSURANCE (YES/NO): ");
            tempvar = in.nextLine().trim();
            if(tempvar.toLowerCase().equals("yes"))
            {
                disInsurance = true;
            }
            else
            {
                disInsurance = false;
            }
            if(skillLevel == 3)
            {
                System.out.println("");
                System.out.print("RETIREMENT (YES/NO): ");
                tempvar = in.nextLine().trim();
                if(tempvar.toLowerCase().equals("yes"))
                {
                    retirement = true;
                }
                else
                {
                    retirement = false;
                }
            }

        }
        else
        {
            System.out.println("");
            System.out.println("NOT ELIGABLE FOR BENEFITS");
        }
    }

    public void getTotal()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER TOTAL HOURS WORKED PER WEEK: ");
        totalHours = in.nextDouble();
        System.out.println("");
        System.out.println("HOURS WORKED: " + totalHours);
        System.out.println("HOURLY RATE: " + payRate);

        if(totalHours > 40)
        {
            double otHours = totalHours - 40;
            System.out.println("REGULAR PAY: " + payRate * 40);
            System.out.println("OT RATE: " + otPay);
            System.out.println("OT PAY: " + otPay * otHours);
            totalPay = ((payRate * 40) + (otPay * otHours)); 
            System.out.println("TOTAL PAY: " + totalPay);
        } 
        else
        {   
            totalPay = totalHours * payRate;
            System.out.println("REGULAR PAY: " + totalPay);
            System.out.println("OT PAY: " + 0);
        }
        if(skillLevel == 1)
        {
            System.out.println("MEDICAL - 0");
            System.out.println("DENTAL - 0");
            System.out.println("DISABILITY - 0");
            System.out.println("RETIREMENT - 0");
        }
        else if(skillLevel == 2)
        {
            if(medicalInsurance == true)
            {
                System.out.println("DISABILITY - 32.50");
                totalPay = totalPay - 32.50;
                System.out.println("TOTAL W DISABILITY: " + totalPay);
            }
            else
            {
                totalPay = totalPay - 0;
                System.out.println("MEDICAL - 0");
            }
            if(dentalInsurance == true)
            {
                System.out.println("DENTAL - 20.00");
                totalPay = totalPay - 20.00;
                System.out.println("TOTAL W DENTAL: " + totalPay);
            }
            else
            {
                totalPay = totalPay - 0;
                System.out.println("DENTAL - 0");
            }
            if(disInsurance == true)
            {
                System.out.println("DISABILITY - 10.00");
                totalPay = totalPay - 10.00;
                System.out.println("TOTAL W DISABILITY: " + totalPay);
            }
            else
            {
                totalPay = totalPay - 0;
                System.out.println("DISABILITY - 0");
            }
        }
        else
        {
            if(medicalInsurance == true)
            {
                System.out.println("DISABILITY - 32.50");
                totalPay = totalPay - 32.50;
                System.out.println("TOTAL W DISABILITY: " + totalPay);
            }
            else
            {
                totalPay = totalPay - 0;
                System.out.println("MEDICAL - 0");
            }
            if(dentalInsurance == true)
            {
                System.out.println("DENTAL - 20.00");
                totalPay = totalPay - 20.00;
                System.out.println("TOTAL W DENTAL: " + totalPay);
            }
            else
            {
                totalPay = totalPay - 0;
                System.out.println("DENTAL - 0");
            }
            if(disInsurance == true)
            {
                System.out.println("DISABILITY - 10.00");
                totalPay = totalPay - 10.00;
                System.out.println("TOTAL W DISABILITY: " + totalPay);
            }
            else
            {
                totalPay = totalPay - 0;
                System.out.println("DISABILITY - 0");
            }
            if(retirement == true)
            {
                double totalPay2;
                if(totalHours > 40)
                {
                    double otHours = totalHours - 40;
                    totalPay2 = ((payRate * 40) + (otPay * otHours)); 
                } 
                else
                {   
                    totalPay2 = totalHours * payRate;
                }
                totalRetirment = (totalPay2 * 0.03);
                totalPay = totalPay - (totalPay2 * 0.03);
                System.out.println("RETIRMENT - " + (totalPay2 * 0.03));
                System.out.println("TOTAL W RETIRMENT: " + totalPay);
            }
        }

        System.out.println("");
        System.out.println("TOTAL PAY: " + totalPay);
        System.out.println("");
    }

}
