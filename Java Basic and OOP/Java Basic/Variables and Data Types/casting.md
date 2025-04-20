# Casting

Di Java, **casting** adalah proses mengubah satu tipe data menjadi tipe data lain. Ada dua jenis casting utama:

---

## 1. Widening Casting (Otomatis / Implicit)
Widening adalah proses konversi dari tipe data yang lebih kecil ke tipe data yang lebih besar. Ini dilakukan secara otomatis oleh Java karena tidak ada risiko kehilangan data.

**Urutan tipe data dari kecil ke besar:**
`byte` → `short` → `char` → `int` → `long` → `float` → `double`

### Contoh:
```java
int myInt = 10;
double myDouble = myInt; // casting otomatis dari int ke double
System.out.println(myDouble); // Output: 10.0
```

---

## 2. Narrowing Casting (Manual / Explicit)
Narrowing adalah proses konversi dari tipe data yang lebih besar ke tipe data yang lebih kecil. Ini harus dilakukan secara **manual** dan berpotensi menyebabkan **kehilangan data**.

### Contoh:
```java
double myDouble = 9.78;
int myInt = (int) myDouble; // casting manual dari double ke int
System.out.println(myInt); // Output: 9 (angka dibulatkan)
```

### Format umum:
```java
tipeDataTujuan namaVariabelBaru = (tipeDataTujuan) variabelAsal;
```

---

## 3. Casting pada Objek (Object Casting)
Dalam konsep OOP (Object-Oriented Programming), casting juga bisa dilakukan pada objek turunan (subclass) dan induk (superclass).

### Upcasting (otomatis)
```java
Animal a = new Dog(); // Dog adalah subclass dari Animal
```

### Downcasting (manual)
```java
Dog d = (Dog) a; // casting manual dari superclass ke subclass
```
**Catatan:** Downcasting harus hati-hati karena jika objek aslinya bukan instance dari tipe tujuan, maka akan menyebabkan error saat runtime.

---

## Tips:
- Gunakan **widening casting** jika memungkinkan karena lebih aman.
- Gunakan **narrowing casting** hanya jika kamu yakin nilainya masih sesuai.
- Untuk **objek**, pastikan casting hanya dilakukan ke tipe yang benar (gunakan `instanceof` untuk mengecek).
