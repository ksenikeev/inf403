# Обработка ошибок

```java
try {
        // Код, который может вызвать исключение
} catch (ExceptionType e) {
    // действие при возникновении ошибки
} finally {
    // действие, выполняемое в любом случае   
}

```

## Делегирование ошибок

В сигнатуре метода описываем возможные исключения

```java
    public static double input() throws InputMismatchException, ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
```

## Генерация своих исключений

Для выброса своего исключения 
```java
throw new NotPositiveNumber();
```

Для создания своего исключения
```java
public class NotPositiveNumber extends Exception {
}
```

### Задача

Экспедиция:
10 машин вероятность поломки 60%
в машине 2 человека, а мест 5

Если машина ломается, то экипаж пересаживается в свободные автомобили

экспидиция неудачна, если после очередной поломки не хватает мест

1000 км

каждые (50) 100 км определяется наличие критической неисправности

факт поломки машины в программе отражается выбросом исключения