const express = require("express");
const app = express();

app.use(express.json());

app.get("/", (req, res, next) => {
  res.json({ message: "Successfully!" });
});
app.listen(3000, () => {
  console.log("Server's listening on port 3000");
});
