// ${COMPLETE_ITEM:override M(int)}
module Module

[<AbstractClass>]
type Base<'T>() =
    abstract M: 'T -> unit
    abstract M: string -> unit

{ new Base<int>() with
    override this.M(s: string) = ()
    {caret} }
