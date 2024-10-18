# Circle Calculator Program

## Description

This Java program allows users to calculate various properties of a circle, such as its area, circumference, or the area of a sector with a given central angle. The user is prompted to provide the radius of the circle and choose the desired calculation.

## Features

- **Calculate Area and Circumference:** The user can choose to calculate the area and circumference of a circle based on a given radius.
- **Calculate Sector Area:** The user can provide the measure of a central angle (in degrees) to calculate the area of the corresponding sector of the circle.
- **Input Validation:** The program ensures that the radius is positive and checks if the input for the operation is valid.

## How to Use

1. **Enter the Radius:** The program prompts the user to enter the radius of the circle. Ensure the radius is greater than 0.
2. **Choose an Operation:** The user is then prompted to choose between two operations:
   - Enter **1** to calculate the area and circumference of the circle.
   - Enter **2** to calculate the area of a circle sector with a specified central angle.
3. **View Results:** The program displays the calculated results based on the selected operation.

## Example Usage

1. **Calculate Area and Circumference**
   - Input radius: `5`
   - Choose operation: `1`
   - Output:
     - Area: `78.5`
     - Circumference: `31.400000000000002`

2. **Calculate Sector Area**
   - Input radius: `5`
   - Choose operation: `2`
   - Input central angle (α): `60`
   - Output:
     - Sector Area: `13.083333333333334`

## Code Snippet

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double alan, daireDilimininAlani, cevre, pi = 3.14, yaricap, alfa;
        int islem;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = scanner.nextDouble();

        if (yaricap <= 0) {
            System.out.println("Geçersiz yarıçap değeri. Yarıçap pozitif bir sayı olmalıdır.");
        } else {
            System.out.println("İşlem seçiniz: 1-->Daire cevresi ve alani , 2--> Ölçüsü alfa olan daire diliminin alanı: ");
            islem = scanner.nextInt();
            if (islem == 1) {
                alan = pi * (yaricap * yaricap);
                cevre = 2 * pi * yaricap;

                System.out.println("Alan : " + alan);
                System.out.println("Çevre : " + cevre);
            } else if (islem == 2) {
                System.out.println("Daire diliminin merkez açısının ölçüsünü giriniz: ");
                alfa = scanner.nextDouble();
                daireDilimininAlani = (pi * (yaricap * yaricap) * alfa) / 360;
                System.out.println("Dairenin " + alfa + " merkez açı ölçülü alanı " + daireDilimininAlani);
            } else {
                System.out.println("Geçersiz işlem girdiniz. Lütfen 1 veya 2 giriniz.");
            }
        }
    }
}
```

## Requirements

- Java Development Kit (JDK) 8 or higher.

## How to Run

1. **Compile the Program**: Use the following command to compile the Java program.
   ```
   javac Main.java
   ```
2. **Run the Program**: Use the following command to run the compiled Java program.
   ```
   java Main
   ```

## Author

- **Hekim Can Aktas**

