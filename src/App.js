import "./styles/App.css";
import Nav from "./components/Nav";

import { BrowserRouter, Routes, Route } from "react-router-dom";
import Rental from "./pages/Rental";
import Profile from "./pages/Profile";
import Login from "./pages/Login";
import About from "./pages/About";
import Home from "./pages/Home";

function App() {
  return (
    <div className="App">
      <Nav />
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/login" element={<Login />} />
          <Route path="/profile" element={<Profile />} />
          <Route path="/rental" element={<Rental />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
