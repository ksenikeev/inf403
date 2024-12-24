# Enum

```java
public enum Color {
    red,
    green,
    black,
    blue,
    yellow
}
```

### Обращение к элементам

```java
Color color = Color.red;

Color red = Color.valueOf("red");
```

### Специальный класс, хранящий свои экземпляры

```java
public enum Color {
    red,
    green,
    black,
    blue,
    yellow;
    
    long code;
    
}
```
Конструктор - приватный