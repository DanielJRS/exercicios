/*
Desenvolva um programa que calcule o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos pelo usuário. Utilize uma função para calcular o IMC e console.log para exibir a categoria do IMC (baixo peso, normal, sobrepeso, obesidade).
*/

function imc (num){
    res = peso / (altura * altura);
    if (res < 16.9){
        return categoria = "magreza"
    }
}

let p = parseFloat(prompt("Digite seu peso: "));
let a = parseFloat(prompt("Digite a sua altura: "));
let res = 0;
let categoria = null;

let peso = p.toFixed(2);
let altura = a.toFixed(2);

console.log(imc(res))
