// ${COMPLETE_ITEM:override P with set(int)}
module Module

[<AbstractClass>]
type Base() =
    abstract P: int with get, set

type A() =
    inherit Base()

    {caret}
