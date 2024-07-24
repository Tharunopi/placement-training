// constructors

// function details(name, age, role, tdx){
    
//         this.name = name,
//         this.age = age,
//         this.role = role,
//         this.tdx = age<19 ? "18%":"25%"
//     }


// let a = new details("aqeel", 21, "fresher")
// console.log(a)

// dynamic objects

// const a = {
//     name: " Aqeel",
//     gender: "attack on titan"
// }


// a.category = "canibal"


// delete a.gender

// console.log(a)

// a.gender = function gen(){
//     return "attack on titan"
// }

// console.log(a.gender())

// const Progrma = function(name){
//     this.name = name
//     this.age = function(){
//         console.log(21)
//     }
// }
// let pro = new Progrma("tharun")
// console.log(pro.name)
// pro.age()

// let a = {
//     k:2,
//     f:3
// }
// for(let i in a){
//     console.log(i)
// }

// let keys = Object.keys(a)
// console.log(keys)
// let values = Object.values(a)
// console.log(values)

// let a = {1:"one", 2:"two", 3:"three"}
// let b = [1, 2, 3]

// for(let i in a){
//     console.log(a[i])
// }
// for(let i in b){
//     console.log(b[i])
// }

// let entry = Object.entries(a)
// console.log(entry)

// let a = {1:1, 2:2}
// let b = {...a}
// b["1"] = 10
// console.log(a)
// console.log(b)
let min = 100
let max = 125
let a = Math.round(Math.random() * (max -min )+min)
console.log(a)