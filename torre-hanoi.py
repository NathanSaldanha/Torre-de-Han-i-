import math

def metodo(num):
    
    base = 2
    resultado = pow(base, num)-1
    print('towerHanoi(',num,') =>',resultado)
    
num = int (input('Defina o número de discos: '))
resultado = metodo(num)