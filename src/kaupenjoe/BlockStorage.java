package kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class BlockStorage<T extends Block> {
    private List<T> blocks;

    public BlockStorage() {
        this.blocks = new ArrayList<>();
    }

    public void addBlock(T block) {
        blocks.add(block);
        System.out.println("Added " + block + " to teh Block Storage.");
    }

    public void displayBlocks() {
        System.out.println("Block in our Storage:");
        for(T block : blocks) {
            System.out.println("- " + block);
        }
    }
}