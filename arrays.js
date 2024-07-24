// let a = [1, 2,3,4]
// console.log(a.includes(30))
// console.log(a.indexOf(3))

// let a = [
//     {name:"tharun",
//         age:10
//     },
//     {name:"aqeel",
//         age:9
//     },
//     {name:"harish",
//         age:9999
//     }
// ]

// let finding = a.find(function(e){
//     return e.age == 9999
// })
// console.log(finding)

// let indes = a.findIndex(function(i){
//     return i.age == 9999
// })

// console.log(indes)

// let a = [1, 2, 3, 4, 5, 6]
// let b = [7,8,9]
// console.log([...a, ...b])

// let a = [1, 2, 3, 4, 5, 6]
// for(let i in a){
//     console.log(a[i])
// }

// let a = ['z', 'c', ]
// console.log(a.sort())

// let b = [
//     {
//         id:100,
//         name:"maqeel"
//     },
//     {
//         id:2,
//         name:"kay aqeel"
//     },
//     {
//         id:1,
//         name:"straight aqeel"
//     }
// ]

// console.log(b.sort(function(a, b){
//     if(a.id < b.id){
//         return -1
//     }else if(a.id > b.id){
//         return 1
//     }
//     return 0
// }))

// let a = [21, 12]
// console.log(a.every(function(e){
//     return e%2 == 0
// }))

// console.log(a.some(function(e){
//     return e%2 == 0
// }))

// let a = [1, 2, 3, 4, 5]
// console.log(a.filter(function(e){
//     return e%2 == 0
// }))

let a = [
    {
        id:1,
        name:"aqeel"
    },
    {
        id:2,
        name:"naveen"
    },
    {
        id:3,
        name:"dharanish"
    },
    {
        id:4,
        name:"tharun"
    },
    {
        id:9,
        name:"harish"
    }
]

console.log(a.filter(function(e){
    return e.id%2 != 0
}))