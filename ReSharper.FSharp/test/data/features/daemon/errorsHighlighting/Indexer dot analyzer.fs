module Module

let a = [|1; 2|]
let l = []

a.[1]
l.[1]

(id a).[1]
(id(a)).[1]

id a.[1]
id(a).[1]

"12".[1]
"12".[1..]
