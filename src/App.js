import React from "react";

import { useRoutes } from "react-router-dom";
import HomePage from "pages/HomePage";
import LoginPage from "pages/LoginPage";

export default function App() {
  const routes = useRoutes([
    {
      exact: true,
      path: "/",
      element: <HomePage />,
    },
     {
      path: "/login",
      element: <LoginPage />,
    },
    
  ]);
  return routes;
}
