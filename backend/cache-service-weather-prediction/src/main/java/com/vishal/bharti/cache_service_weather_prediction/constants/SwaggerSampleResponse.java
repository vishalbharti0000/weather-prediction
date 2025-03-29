package com.vishal.bharti.cache_service_weather_prediction.constants;

public final class SwaggerSampleResponse {

    private SwaggerSampleResponse() {}

    public static final String CITY_NOT_FOUND = """
                            {
                                "error": "City not found"
                            }
                            """;

    public static final String INTERNAL_SERVER_ERROR = """
                            {
                                "error": "Internal server error. Failed to fetch data from API.
                            }
                            """;

    public static final String SUCCESS_WEATHER_EXAMPLE = """
        {
{
  "cod": "200",
  "message": 0,
  "cnt": 32,
  "list": [
    {
      "dt": 1743206400,
      "main": {
        "temp": 280.66,
        "feels_like": 278.17,
        "temp_min": 280.66,
        "temp_max": 281.33,
        "pressure": 1017,
        "sea_level": 1017,
        "grnd_level": 1013,
        "humidity": 65,
        "temp_kf": -0.67
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 2
      },
      "wind": {
        "speed": 3.85,
        "deg": 314,
        "gust": 9.55
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-29 00:00:00"
    },
    {
      "dt": 1743217200,
      "main": {
        "temp": 279.97,
        "feels_like": 277.8,
        "temp_min": 279.8,
        "temp_max": 279.97,
        "pressure": 1019,
        "sea_level": 1019,
        "grnd_level": 1015,
        "humidity": 70,
        "temp_kf": 0.17
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 2
      },
      "wind": {
        "speed": 3.07,
        "deg": 306,
        "gust": 8.86
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-29 03:00:00"
    },
    {
      "dt": 1743228000,
      "main": {
        "temp": 277.22,
        "feels_like": 275.05,
        "temp_min": 277.22,
        "temp_max": 277.22,
        "pressure": 1022,
        "sea_level": 1022,
        "grnd_level": 1017,
        "humidity": 76,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 3
      },
      "wind": {
        "speed": 2.39,
        "deg": 292,
        "gust": 7.36
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-29 06:00:00"
    },
    {
      "dt": 1743238800,
      "main": {
        "temp": 284.41,
        "feels_like": 283.11,
        "temp_min": 284.41,
        "temp_max": 284.41,
        "pressure": 1023,
        "sea_level": 1023,
        "grnd_level": 1019,
        "humidity": 58,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 2.83,
        "deg": 292,
        "gust": 4.7
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-29 09:00:00"
    },
    {
      "dt": 1743249600,
      "main": {
        "temp": 283.39,
        "feels_like": 281.51,
        "temp_min": 283.39,
        "temp_max": 283.39,
        "pressure": 1023,
        "sea_level": 1023,
        "grnd_level": 1019,
        "humidity": 40,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 73
      },
      "wind": {
        "speed": 3.07,
        "deg": 266,
        "gust": 4.13
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-29 12:00:00"
    },
    {
      "dt": 1743260400,
      "main": {
        "temp": 286.32,
        "feels_like": 284.68,
        "temp_min": 286.32,
        "temp_max": 286.32,
        "pressure": 1022,
        "sea_level": 1022,
        "grnd_level": 1017,
        "humidity": 38,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 40
      },
      "wind": {
        "speed": 4.61,
        "deg": 252,
        "gust": 6.2
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-29 15:00:00"
    },
    {
      "dt": 1743271200,
      "main": {
        "temp": 284.42,
        "feels_like": 282.99,
        "temp_min": 284.42,
        "temp_max": 284.42,
        "pressure": 1021,
        "sea_level": 1021,
        "grnd_level": 1017,
        "humidity": 53,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 67
      },
      "wind": {
        "speed": 3.56,
        "deg": 243,
        "gust": 8.01
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-29 18:00:00"
    },
    {
      "dt": 1743282000,
      "main": {
        "temp": 282.29,
        "feels_like": 279.6,
        "temp_min": 282.29,
        "temp_max": 282.29,
        "pressure": 1020,
        "sea_level": 1020,
        "grnd_level": 1016,
        "humidity": 70,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 5.17,
        "deg": 229,
        "gust": 12.2
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-29 21:00:00"
    },
    {
      "dt": 1743292800,
      "main": {
        "temp": 282.58,
        "feels_like": 279.79,
        "temp_min": 282.58,
        "temp_max": 282.58,
        "pressure": 1018,
        "sea_level": 1018,
        "grnd_level": 1014,
        "humidity": 79,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 5.63,
        "deg": 236,
        "gust": 13.23
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-30 00:00:00"
    },
    {
      "dt": 1743303600,
      "main": {
        "temp": 283,
        "feels_like": 280.82,
        "temp_min": 283,
        "temp_max": 283,
        "pressure": 1018,
        "sea_level": 1018,
        "grnd_level": 1013,
        "humidity": 88,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 4.34,
        "deg": 253,
        "gust": 11.69
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-30 03:00:00"
    },
    {
      "dt": 1743314400,
      "main": {
        "temp": 282.49,
        "feels_like": 280.13,
        "temp_min": 282.49,
        "temp_max": 282.49,
        "pressure": 1018,
        "sea_level": 1018,
        "grnd_level": 1014,
        "humidity": 90,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 4.48,
        "deg": 275,
        "gust": 11.42
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-30 06:00:00"
    },
    {
      "dt": 1743325200,
      "main": {
        "temp": 284.68,
        "feels_like": 283.4,
        "temp_min": 284.68,
        "temp_max": 284.68,
        "pressure": 1020,
        "sea_level": 1020,
        "grnd_level": 1015,
        "humidity": 58,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 47
      },
      "wind": {
        "speed": 5.69,
        "deg": 307,
        "gust": 9.91
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-30 09:00:00"
    },
    {
      "dt": 1743336000,
      "main": {
        "temp": 287.55,
        "feels_like": 286.22,
        "temp_min": 287.55,
        "temp_max": 287.55,
        "pressure": 1021,
        "sea_level": 1021,
        "grnd_level": 1017,
        "humidity": 45,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 26
      },
      "wind": {
        "speed": 5.55,
        "deg": 313,
        "gust": 8.31
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-30 12:00:00"
    },
    {
      "dt": 1743346800,
      "main": {
        "temp": 288.81,
        "feels_like": 287.48,
        "temp_min": 288.81,
        "temp_max": 288.81,
        "pressure": 1021,
        "sea_level": 1021,
        "grnd_level": 1017,
        "humidity": 40,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 0
      },
      "wind": {
        "speed": 5.91,
        "deg": 320,
        "gust": 8.89
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-30 15:00:00"
    },
    {
      "dt": 1743357600,
      "main": {
        "temp": 285.94,
        "feels_like": 284.71,
        "temp_min": 285.94,
        "temp_max": 285.94,
        "pressure": 1023,
        "sea_level": 1023,
        "grnd_level": 1019,
        "humidity": 55,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 0
      },
      "wind": {
        "speed": 4.67,
        "deg": 332,
        "gust": 8.95
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-30 18:00:00"
    },
    {
      "dt": 1743368400,
      "main": {
        "temp": 283.34,
        "feels_like": 282.14,
        "temp_min": 283.34,
        "temp_max": 283.34,
        "pressure": 1026,
        "sea_level": 1026,
        "grnd_level": 1021,
        "humidity": 66,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 2
      },
      "wind": {
        "speed": 3.29,
        "deg": 326,
        "gust": 8.3
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-30 21:00:00"
    },
    {
      "dt": 1743379200,
      "main": {
        "temp": 281.58,
        "feels_like": 280.27,
        "temp_min": 281.58,
        "temp_max": 281.58,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1023,
        "humidity": 72,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 3
      },
      "wind": {
        "speed": 2.29,
        "deg": 351,
        "gust": 6.29
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-31 00:00:00"
    },
    {
      "dt": 1743390000,
      "main": {
        "temp": 280.35,
        "feels_like": 280.35,
        "temp_min": 280.35,
        "temp_max": 280.35,
        "pressure": 1028,
        "sea_level": 1028,
        "grnd_level": 1023,
        "humidity": 78,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 5
      },
      "wind": {
        "speed": 0.95,
        "deg": 352,
        "gust": 1.62
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-31 03:00:00"
    },
    {
      "dt": 1743400800,
      "main": {
        "temp": 280.02,
        "feels_like": 280.02,
        "temp_min": 280.02,
        "temp_max": 280.02,
        "pressure": 1028,
        "sea_level": 1028,
        "grnd_level": 1024,
        "humidity": 79,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 35
      },
      "wind": {
        "speed": 1.03,
        "deg": 25,
        "gust": 1.01
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-31 06:00:00"
    },
    {
      "dt": 1743411600,
      "main": {
        "temp": 283.56,
        "feels_like": 282.22,
        "temp_min": 283.56,
        "temp_max": 283.56,
        "pressure": 1029,
        "sea_level": 1029,
        "grnd_level": 1025,
        "humidity": 60,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 44
      },
      "wind": {
        "speed": 1.76,
        "deg": 57,
        "gust": 2.58
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-31 09:00:00"
    },
    {
      "dt": 1743422400,
      "main": {
        "temp": 287.41,
        "feels_like": 286.07,
        "temp_min": 287.41,
        "temp_max": 287.41,
        "pressure": 1029,
        "sea_level": 1029,
        "grnd_level": 1025,
        "humidity": 45,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 44
      },
      "wind": {
        "speed": 2.31,
        "deg": 63,
        "gust": 2.78
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-31 12:00:00"
    },
    {
      "dt": 1743433200,
      "main": {
        "temp": 288.58,
        "feels_like": 287.28,
        "temp_min": 288.58,
        "temp_max": 288.58,
        "pressure": 1028,
        "sea_level": 1028,
        "grnd_level": 1023,
        "humidity": 42,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 7
      },
      "wind": {
        "speed": 3.46,
        "deg": 90,
        "gust": 3.48
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-31 15:00:00"
    },
    {
      "dt": 1743444000,
      "main": {
        "temp": 284.66,
        "feels_like": 283.17,
        "temp_min": 284.66,
        "temp_max": 284.66,
        "pressure": 1028,
        "sea_level": 1028,
        "grnd_level": 1024,
        "humidity": 50,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 10
      },
      "wind": {
        "speed": 3.74,
        "deg": 104,
        "gust": 4.98
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-03-31 18:00:00"
    },
    {
      "dt": 1743454800,
      "main": {
        "temp": 281.72,
        "feels_like": 279.82,
        "temp_min": 281.72,
        "temp_max": 281.72,
        "pressure": 1029,
        "sea_level": 1029,
        "grnd_level": 1025,
        "humidity": 63,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 14
      },
      "wind": {
        "speed": 3.21,
        "deg": 91,
        "gust": 8.29
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-03-31 21:00:00"
    },
    {
      "dt": 1743465600,
      "main": {
        "temp": 280.43,
        "feels_like": 278.25,
        "temp_min": 280.43,
        "temp_max": 280.43,
        "pressure": 1028,
        "sea_level": 1028,
        "grnd_level": 1023,
        "humidity": 71,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 14
      },
      "wind": {
        "speed": 3.23,
        "deg": 81,
        "gust": 9.28
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-04-01 00:00:00"
    },
    {
      "dt": 1743476400,
      "main": {
        "temp": 279.42,
        "feels_like": 277.03,
        "temp_min": 279.42,
        "temp_max": 279.42,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1022,
        "humidity": 78,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 19
      },
      "wind": {
        "speed": 3.22,
        "deg": 79,
        "gust": 9.69
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-04-01 03:00:00"
    },
    {
      "dt": 1743487200,
      "main": {
        "temp": 279.07,
        "feels_like": 276.76,
        "temp_min": 279.07,
        "temp_max": 279.07,
        "pressure": 1026,
        "sea_level": 1026,
        "grnd_level": 1022,
        "humidity": 85,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02d"
        }
      ],
      "clouds": {
        "all": 13
      },
      "wind": {
        "speed": 3,
        "deg": 76,
        "gust": 9.73
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-04-01 06:00:00"
    },
    {
      "dt": 1743498000,
      "main": {
        "temp": 283.39,
        "feels_like": 282.09,
        "temp_min": 283.39,
        "temp_max": 283.39,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1022,
        "humidity": 62,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 8
      },
      "wind": {
        "speed": 5.31,
        "deg": 91,
        "gust": 9.44
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-04-01 09:00:00"
    },
    {
      "dt": 1743508800,
      "main": {
        "temp": 285.91,
        "feels_like": 284.39,
        "temp_min": 285.91,
        "temp_max": 285.91,
        "pressure": 1025,
        "sea_level": 1025,
        "grnd_level": 1021,
        "humidity": 44,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 7
      },
      "wind": {
        "speed": 5.83,
        "deg": 88,
        "gust": 9.06
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-04-01 12:00:00"
    },
    {
      "dt": 1743519600,
      "main": {
        "temp": 285.25,
        "feels_like": 283.77,
        "temp_min": 285.25,
        "temp_max": 285.25,
        "pressure": 1024,
        "sea_level": 1024,
        "grnd_level": 1020,
        "humidity": 48,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 0
      },
      "wind": {
        "speed": 5.92,
        "deg": 87,
        "gust": 8.75
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-04-01 15:00:00"
    },
    {
      "dt": 1743530400,
      "main": {
        "temp": 283.41,
        "feels_like": 282.03,
        "temp_min": 283.41,
        "temp_max": 283.41,
        "pressure": 1024,
        "sea_level": 1024,
        "grnd_level": 1020,
        "humidity": 59,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 0
      },
      "wind": {
        "speed": 4.91,
        "deg": 81,
        "gust": 11.69
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2025-04-01 18:00:00"
    },
    {
      "dt": 1743541200,
      "main": {
        "temp": 281.88,
        "feels_like": 279.46,
        "temp_min": 281.88,
        "temp_max": 281.88,
        "pressure": 1025,
        "sea_level": 1025,
        "grnd_level": 1021,
        "humidity": 68,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 0
      },
      "wind": {
        "speed": 4.27,
        "deg": 75,
        "gust": 13.14
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2025-04-01 21:00:00"
    }
  ],
  "city": {
    "id": 2643743,
    "name": "London",
    "coord": {
      "lat": 51.5085,
      "lon": -0.1257
    },
    "country": "GB",
    "population": 1000000,
    "timezone": 0,
    "sunrise": 1743140679,
    "sunset": 1743186372
  }
}

    """;

}
