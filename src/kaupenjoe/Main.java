package kaupenjoe;

public class Main {
    public static void main(String[] args) {
        /* Generics */

        BlockStorage<Block> blockStorage = new BlockStorage<>();
        blockStorage.addBlock(new StoneBlock());
        blockStorage.addBlock(new StoneBlock());
        blockStorage.addBlock(new WoodBlock());
        blockStorage.addBlock(new StoneBlock());
        blockStorage.displayBlocks();

        BlockStorage<WoodBlock> woodenBlockStorage = new BlockStorage<>();
        woodenBlockStorage.addBlock(new WoodBlock());
        woodenBlockStorage.addBlock(new WoodBlock());
        woodenBlockStorage.addBlock(new WoodLogBlock());


    }
}