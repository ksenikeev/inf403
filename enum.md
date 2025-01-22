# Enum

```java
public enum Color {
    red,
    green,
    black,
    blue,
    yellow
}

public class Color {
    public static Color red = new Color(),
            green = new Color();
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