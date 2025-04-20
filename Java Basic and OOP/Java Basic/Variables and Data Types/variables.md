## Cara membuat variabel
tipe_data nama_variabel = nilai,

Menambahkan nilai tidak harus saat variabel baru dibuat. Nilai dari variabel juga dapat diubah.

Contoh:
```java
int angkaKecil = 15;
angkaKecil = 3000;
System.out.println(angkaKecil);
```
Output:
```
3000
```


## Primitive Data Types
> Mencakup byte, short, int, long, float, double, boolean, dan char. 

> Sudah didefinisikan sebelumnya dan merupakan bagian bawaan dari bahasa pemograman.

> Dapat digunakan untuk memanggil method tertentu untuk menlakukan operasi tertentu.

> Diawali dengan huruf kecil.

> Selalu menyimpan sebuah nilai.

> Mencakup:

   >> byte: Menyimpan bilanagn bulat dari -128 hingga 127

   >> short: Menyimpan bilangan bulat dari -32.768 hingga 32.767

   >> int: Menyimpan bilangan bulat dari -2.147.483.648 hingga 2.147.483.647

   >> long: Menyimpan bilangan bulat dari -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807

   >> float: Menyimpan bilangan pecahan. Cukup untuk menyimpan 6 hingga 7 digit desimal

   >> double: Menyimpan bilangan pecahan. Cukup untuk menyimpan 15 hingga 16 digit desimal

   >> boolean: Menyimpan nilai true (benar) atau false (salah)

   >> char: Menyimpan satu karakter/huruf atau nilai ASCII


## Non-primitive Data Types
> Mencakup misalnya String dan Array.

> Dibuat oleh programmer (bukan bawaan bahasa seperti tipe primitif).

> Tidak bisa langsung dipakai untuk operasi dasar seperti penjumlahan.

> Biasanya diawali dengan huruf kapital.

> Dapat menyimpan nilai 'null'.

> Digunakan untuk menyimpan objek yang lebih kompleks.


## Contoh
```java
  public class Main {
    public static void main(String[] args) {
      int num1 = 90, num2 = 23;
      String shape = "Circle";
      float radius = 65.32f;
      final double phi = 3.1413;    // Unchangeable and read only
      boolean greater = (num1 > num2);

      System.out.println("\nThe result of " + num1 + " + " + num2 + " = " + (num1 + num2));

      System.out.println("It is " + greater + " that " + num1 + " is greater than " + num2);

      System.out.printf("The area of %s with radius %.2f is %.2f\n\n", shape, radius, (phi * radius * radius));
    }
  }
```
Output:
```
The result of 90 + 23 = 113
It is true that 90 is greater than 23
The area of Circle with radius 65,32 is 13402,99
```
