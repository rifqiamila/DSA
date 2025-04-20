## Conditional: Switch Statement di Java

Statement `switch` digunakan untuk memilih salah satu dari banyak blok kode yang akan dijalankan, berdasarkan nilai dari sebuah variabel.

### Struktur umum:
```java
switch (expression) {
  case nilai1:
    // blok kode jika expression == nilai1
    break;
  case nilai2:
    // blok kode jika expression == nilai2
    break;
  ...
  default:
    // blok kode jika tidak ada case yang cocok
}
```

### Penjelasan:
- `switch`: kata kunci untuk memulai pernyataan switch
- `expression`: nilai yang akan dibandingkan
- `case`: setiap kemungkinan nilai yang bisa cocok
- `break`: menghentikan eksekusi lebih lanjut dalam switch
- `default`: dijalankan jika tidak ada case yang cocok

### Contoh:
```java
int day = 3;
switch (day) {
  case 1:
    System.out.println("Senin");
    break;
  case 2:
    System.out.println("Selasa");
    break;
  case 3:
    System.out.println("Rabu");
    break;
  case 4:
    System.out.println("Kamis");
    break;
  case 5:
    System.out.println("Jumat");
    break;
  default:
    System.out.println("Akhir Pekan");
}
```

### Output:
```
Rabu
```

### Catatan:
- Tanpa `break`, eksekusi akan "jatuh" ke case selanjutnya (fall-through behavior).
- `default` bersifat opsional, tetapi disarankan untuk menangani nilai yang tidak cocok.

`switch` digunakan ketika ada banyak kondisi yang didasarkan pada nilai yang sama, agar kode lebih rapi daripada menggunakan banyak `if-else`.

