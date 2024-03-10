import java.util.Scanner;

class Bank {
    float rateOfInterest;

    void rateOfInterest(float r) {
        rateOfInterest = r;
    }
}

class SBI extends Bank {
    @Override
    void rateOfInterest(float r) {
        rateOfInterest = r;
    }
}

class AXIS extends Bank {
    @Override
    void rateOfInterest(float r) {
        rateOfInterest = r;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SBI sbi = new SBI();
        AXIS axis = new AXIS();

        System.out.print("Enter principal amount: ");
        float principalAmount = scanner.nextFloat();

        System.out.print("Enter rate of interest for SBI: ");
        float sbiInterest = scanner.nextFloat();

        System.out.print("Enter rate of interest for AXIS: ");
        float axisInterest = scanner.nextFloat();

        sbi.rateOfInterest(sbiInterest);
        axis.rateOfInterest(axisInterest);

        float sbiAmount = principalAmount + (principalAmount * sbi.rateOfInterest / 100);
        float axisAmount = principalAmount + (principalAmount * axis.rateOfInterest / 100);

        System.out.println("Amount gain in SBI after adding ROI: " + sbiAmount);
        System.out.println("Amount gain in AXIS after adding ROI: " + axisAmount);

        scanner.close();
    }
}
