package main;
import rio.Rio;
public class MainRio {
    public static void main(String[] args) {
        Rio obj = new Rio("Rio negro", 10, false);
        System.out.println(obj.mostra());

        obj.nivelAgua();
        obj.poluicao();
    }
}