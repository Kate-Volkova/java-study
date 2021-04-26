package ru.stqa.pft.sandbox;

public class Square {

    public int a;

    public Square (int a) { // конструктор - необысная функция, кот ничего не передаёт
        // нужна для возможности передавать параметры экземпляра класса (объекта) сразу при его создании
        this.a = a; // this.a - атрибут ЭТОГО класса Square, a - переменная конструктора Square
    }

    public int square () { // без параметров, потому что они передаются через this
        return this.a * this.a; // this - ссылка на текущий объект, описанный классом Sruare
    }
}
