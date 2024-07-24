// let a = [1,2,3,4]
// let b = ["a", "b", "c", "d"]


// console.log(a.map(function(e){
//     return Math.pow(e, 2)
// }))

// console.log(b.map(function(e){
//     return e.toUpperCase()
// }))

// let c = [
//     { name: "Alice", age: 30 },
//     { name: "Bob", age: 25 },
//     { name: "Charlie", age: 35 }
// ];

// let low = c.map(function(e) {
//     return {
//         ...e,
//         name: e.name.toUpperCase()
//     };
// });

// console.log(low);

// let high = low.map(function(e){
//     return{
//         ...e,
//         name:e.name.toLowerCase()
//     }
// })

// console.log(high)

let a = [1, 15, 14]
console.log(a.reduce(function(a, c){
    return a + c
}))
