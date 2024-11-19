from zeep import Client

# URL del WSDL del servicio web
wsdl = 'http://www.dneonline.com/calculator.asmx?wsdl'

# Crear un cliente
client = Client(wsdl=wsdl)

# Llamar a las operaciones del servicio web
a = 10
b = 20

try:
    add_result = client.service.Add(intA=a, intB=b)
    subtract_result = client.service.Subtract(intA=a, intB=b)
    multiply_result = client.service.Multiply(intA=a, intB=b)
    divide_result = client.service.Divide(intA=b, intB=a)

    # Imprimir los resultados
    print(f'Add Result: {add_result}')
    print(f'Subtract Result: {subtract_result}')
    print(f'Multiply Result: {multiply_result}')
    print(f'Divide Result: {divide_result}')
except Exception as e:
    print(f"An error occurred: {e}")
