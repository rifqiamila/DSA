# Looping di Java
Looping digunakan untuk menjalankan suatu blok kode secara berulang berdasarkan kondisi tertentu.

## 1. While Loop
Loop `while` akan terus berjalan selama kondisi bernilai `true`. Cocok digunakan jika kita tidak tahu pasti berapa kali pengulangan akan dilakukan.

### Struktur umum:
```java
while (kondisi) {
  // blok kode yang akan diulang
}
```

### Contoh:
```java
int i = 1;
while (i <= 5) {
  System.out.println(i);
  i++;
}
```

### Output:
```
1
2
3
4
5
```

---

## 2. Do-While Loop
Loop `do-while` mirip seperti `while`, tetapi blok kode akan dijalankan minimal **satu kali**, bahkan jika kondisinya `false` di awal.

### Struktur umum:
```java
do {
  // blok kode yang akan diulang
} while (kondisi);
```

### Contoh:
```java
int i = 1;
do {
  System.out.println(i);
  i++;
} while (i <= 5);
```

### Output:
```
1
2
3
4
5
```

---

## 3. For Loop
Loop `for` digunakan jika kita sudah mengetahui berapa kali pengulangan akan dilakukan.

### Struktur umum:
```java
for (inisialisasi; kondisi; update) {
  // blok kode yang akan diulang
}
```

### Contoh:
```java
for (int i = 1; i <= 5; i++) {
  System.out.println(i);
}
```

### Output:
```
1
2
3
4
5
```

---

## Catatan
- Gunakan `while` atau `do-while` jika jumlah iterasi tidak pasti.
- Gunakan `for` jika jumlah iterasi sudah diketahui sebelumnya.

