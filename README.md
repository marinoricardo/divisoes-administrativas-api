# API de Divisão Administrativa de Moçambique

Bem-vindo à API de Divisão Administrativa de Moçambique! Esta API fornece informações sobre as províncias, distritos e bairros de Moçambique.

## Endpoints

### 1. Obter todas as províncias

Retorna uma lista de todas as províncias de Moçambique.

- **URL**: `/provinces`
- **Método**: GET
- **Resposta de Exemplo**:

```json
[
  {
    "id": 1,
    "name": "Maputo",
    "area": "Sul",
    "latitude": "-25.968945",
    "longitude": "32.573216",
    "districts": []
  },
  
]
```

### 2. Obter os distritos e bairros de uma província

Retorna uma lista de distritos e seus bairros dentro de uma província específica.

- **URL**: `/provinces/{province_id}`
- **Método**: GET
- **Parâmetros**:
    - `{province_id}`: ID da província
- **Resposta de Exemplo**:

```json
{
  "id": 1,
  "name": "Maputo",
  "districts": [
    {
      "id": 101,
      "name": "KaMpfumo",
      "neighborhoods": []
    },
  ]
}
```

### 3. Obter apenas os bairros de Moçambique

Retorna uma lista de todos os bairros em Moçambique, independentemente da província ou distrito.

- **URL**: `/neighborhoods`
- **Método**: GET
- **Resposta de Exemplo**:

```json
[
  {
    "id": 1001,
    "name": "Bairro Central",
    "district": "KaMpfumo, Maputo"
  }
]
```

## Contribuição

Se você deseja contribuir para esta API, fique à vontade para fazer um fork deste repositório e enviar pull requests. Entre em contato com Marino Ricardo pelo email geral@marinoricardo.com para mais informações.

## Contato

Para perguntas ou informações adicionais, entre em contato com Marino Ricardo pelo email geral@marinoricardo.com.

---
