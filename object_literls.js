function getDog(name, age, breed, pounds){
    return{
        name: name,
        age: age,
        breed: breed,
        pounds: pounds,
        price: function predict(age){
            return age>5 ? 15000:26000
        },
        pickup: function ped(pounds){
            return pounds>50 ? "pickup location":"online delivery"
        },
        bark(){
            console.log("vuw vuw")
        }
    }
}

const dog1 = getDog("aqeel", 21, "one piece", 127)
// console.log(dog1)
console.log(dog1.price())