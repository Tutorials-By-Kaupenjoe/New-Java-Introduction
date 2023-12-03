package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* Enums & Advanced Enums */

        Difficulty gameDifficulty = Difficulty.MEDIUM;
        System.out.println("Difficulty is " + gameDifficulty);

        ToolMaterial myAxeMaterial = ToolMaterial.STONE;
        ToolMaterial myShovelMaterial = ToolMaterial.IRON;

        System.out.println("My axe has " + myAxeMaterial.getDurability() + " durability");
        System.out.println("My shovel has " + myShovelMaterial.getMiningSpeed() + " mining speed");
    }
}