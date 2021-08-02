package com.patterns;


class Greeting{
    public void hello(){
        System.out.println("Hello");
    }
    public void hi(){
        System.out.println("hi");
    }
}


class EmojiAspect{
    public void withHandRaiseEmoji(){
        System.out.println("🙋‍");
    }
}

class GreetingProxy  {

    Greeting greeting=new Greeting();
    EmojiAspect emoji=new EmojiAspect();

    public void hello() {
        greeting.hello();
        emoji.withHandRaiseEmoji();
    }

    public void hi() {
        greeting.hi();
        emoji.withHandRaiseEmoji();
    }
}

public class Proxy {
    public static void main(String[] args) {

        GreetingProxy greeting=new GreetingProxy();
        greeting.hello();
        greeting.hi();

    }
}
