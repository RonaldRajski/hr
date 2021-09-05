package PearsonChapter11.Assignment1;


//************************************
//    Name: Ronald Rajski
//    Classs: COSC 1174-48L
//    Assignment: Minecraft Blocks
//    Date: 9/5/2021
//
//************************************


//**************************************************************************************
//* UML                                                                                *
//        ******************************************************************************
//* Block: Sand                                                                             *
//
//        -blockID:         55                                                         *
//        -blockName:   Sand                                                           *
//        -toolNeeded:   true                                                          *
//        -hardness:        2                                                          *
//        -itemDrop:      sand                                                         *
//        ******************************************************************************
//        +Sand()                                                                     *
//        +Block(blockID: int, blockName: String, toolNeeded: boolean, hardness: int)  *
//        +setHardness(int): void                                                      *
//        +getHardness(): int                                                          *
//        +isDestroyed(): String                                                       *
//        ******************************************************************************



//        Next, create 2 constructors for sand, 1 default, and 1 that takes in all 5 data fields. (note: both constructors should set the data fields to the same values, as sand must have these values to be sand)
//        Now override all the methods inherited from Block. For isDestroyed, you should invoke getHardness(), and if it is less than 1, return the itemDrop (we won’t worry about actually destroying the block in this class)
//        Finally, write a test class containing the main method, which creates a sand block, and asks the user if they have a shovel. If they do not, they cannot break the block, and they must move on, but if they do, they can start digging. Each digging action should reduce the sand’s hardness until it is below 1, in which case the user is given their sand, and they move on.



//Representative of a Sand Block - extend causes Sand to inherit from the Block class
public class Sand extends Block{

//    ID of the Block
    int blockId;
//    Name of the Block
    String blockName;
//    Whether tool is needed to cause an item to drop
    boolean toolNeeded;
//    hardness of the block
    int hardness;
//    Item that will drop if block is destroyed
    String itemDrop;

//    Makes a new Sand Block with Default values



}
