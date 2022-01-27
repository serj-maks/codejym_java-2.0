package com.vault.innerclass;

public class Cat {

    private String name;
    private Foot foots;
    private Fang fangs;

    /*
    инициализатор
     */
    {
        String name = "";
        foots = new Foot(); // внутренний класс может создавать и использовать объекты во внешнем классе
        System.out.println("создан экземпляр класс Foot");
        fangs = new Fang(); // в инициализаторе синтаксис создания объекта выгладят как "имя_объекта = new имя_класса", а не как обычно "имя_класса имя_объекта = new имя_класса"
        System.out.println("создан экземпляр класс Fang");
    }

    Cat() {

    }

    Cat(String name) {
        this.name = name;
    }

    void run() {
        foots.footRunning();
    }

    void climb() {
        fangs.fangsClimbing();
    }

    /*
    inner_class(non_static_nested_class)
    у класса "Foot" нет модификатора "static"
     */
    class Foot {
        void footRunning() {
            System.out.println("Кошка по имени " + name + " бежит!");
        }
    }

    /*
    с модификатором "private" внутренний класс доступен только внешнему классу
     */
    private class Fang {
        void fangsClimbing() {
            System.out.println("Кошка " + name + " лезет вверх!");
        }
    }
}
