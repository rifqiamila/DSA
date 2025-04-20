## Sintaks Dasar Java
Java adalah bahasa pemmograman yang berbasis pada kelas (OOP). 
```java
  public class Main {
    public static void main(String[] args) {
      System.out.println("Hello World");
    }
  }
```
Output:
```
Hello World
```
Setiap program java ditulis berbasis kelas
```java
  public class Main {
```
Menandakan awal dari blok kode kelas Main. Nama kelaa 'Main' disesuiakan dengan nama file. Public artinya kelas dapat diakses program lain diluar kelas.
```java
    public static void main(String[] args) {
```
main method akan dieksekusi pertama saat kode dijalankan. main method harus selalu ada.

public menunjukkan method bisa diakses dari manapun, bahkan dari luar kelas/

static menunjukkan bahwa method bisa dijalankan tanpa membuat objek dari kelas Main.

void -> method tidak mengembalikan nilai.

String[] args -> args adalah array dari objek String, bisa diunkan untuk menerima argumen dari baris perintah saat menjalankan program (dari terminal).

```java
      System.out.println("Hello World");
```
Berfungsi untuk mencetak "Helo World" ke terminal, didikuti dengan memindah kursor ke baris baru.


## Comments
```java
  // This is a sigle line comment
  /* This
     is
     a
     multi-line
     comment
  */
```
Kode di atas tidak akan menghasilkan output.
