type U =
    | A of int * int
    | B of int * double
    | C of x: int
    | D

match D with
| B _{caret} -> ()