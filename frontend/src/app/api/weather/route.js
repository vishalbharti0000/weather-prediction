import axios from "axios";

export async function GET(request) {
  const { searchParams } = new URL(request.url);
  const city = searchParams.get("city");

  if (!city) {
    return new Response(JSON.stringify({ error: "City is required" }), {
      status: 400,
      headers: { "Content-Type": "application/json" },
    });
  }

  try {
    const response = await axios.get("http://52.71.165.52:91/advice/weather", {
      params: { city },
    });

    return new Response(JSON.stringify(response.data), {
      status: 200,
      headers: { "Content-Type": "application/json" },
    });
  } catch (error) {
    console.error("Error fetching weather data:", error.message);

    return new Response(
      JSON.stringify({ error: "Failed to fetch weather data" }),
      {
        status: 500,
        headers: { "Content-Type": "application/json" },
      }
    );
  }
}
