// function add(a=2, b=2){
//     return a+b
// }

// console.log(add(90))

function add(a, b){
    let product = 0
    for (i of arguments){
        product += i
    }
    console.log(product)
    console.log(arguments)
}

add(1, 2, 3)