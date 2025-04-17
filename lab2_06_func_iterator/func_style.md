# Функциональный стиль программирования в Java

## Лямбда выражения

### Функциональные интерфейсы

Функциональный интерфейс описывает 1 метод, обязательный для реализации (могут иметься методы по умолчанию)

- Потребитель   a -> f(a)
```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
    //...
}
```
- Булевская функция  a -> f(a),  где f(a) - булевское выражение
```java  
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
    //...
}
```
- Функция a -> f(a:T):R
```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
    //...
}
```
- Поставщик  () -> f()
```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```
- Сравнение   (a,b) -> f(a,b) 
```java
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
    //...
}
```


# lambda expressions

lambda - анонимная функция

~ анонимный экземпляр анонимного класса, реализующего некоторый 
функциональный интерфейс 

(arg1, ... , argN) -> {function body}

(набор аргументов) -> {реализация функции интерфейса}

(a,b) -> {return a - b;}

function(arg1, ... , argN) {body}

() -> {return x;}

### 1 аргумент:
```
(a) -> {function body}
a -> {function body}
```

### 1 операнд:
```
    (arg1, ... , argN) -> { return arg1 + ... + argN; }
    (arg1, ... , argN) -> return arg1 + ... + argN
    (arg1, ... , argN) -> arg1 + ... + argN

```

### 1 операнд, использующий метод method класса Func:
```
(arg1, ... , argN) -> Func.method(arg1, ... , argN)

Func::method
```
s -> System.out.println(s)

println System.out

System.out::println