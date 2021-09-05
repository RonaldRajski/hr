package PearsonChapter11.Assignment1;

//************************************
//    Name: Ronald Rajski
//    Classs: COSC 1174
//    Assignment: Minecraft Blocks
//    Date: 9/5/2021
//
//************************************

**************************************************************************************
* UML                                                                                *
        ******************************************************************************
* Block                                                                              *
                                                                                     *
        -blockID:         int                                                        *
        -blockName:   String
        -toolNeeded:   boolean
        -hardness:        int
        -itemDrop:      String
        *******************************************************************************
        +Block()
        +Block(blockID: int, blockName: String, toolNeeded: boolean, hardness: int)
        +setHardness(int): void
        +getHardness(): int
        +isDestroyed(): String

***************************************************************************************



//This represents a MineCraft Block
//This is the super for all block types in the game.
public class Block {

//    id of the block
    int blockId;

//    name of the block
    String blockName;

//    is tool needed to destroy the block and cause an item to drop
    boolean toolNeeded;

//    determines the level of hardness of the block

    int hardness;

//    item that drops upon destruction of the block

    String itemDrop;

//    Creates a block with default values-Default constructor
    public Block(){

    }


}
