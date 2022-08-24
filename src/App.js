import React from "react";

import { useRoutes } from "react-router-dom";
import HomePage from "pages/HomePage";

export default function App() {
  const routes = useRoutes([
    {
      exact: true,
      path: "/",
      element: <HomePage />,
    },
    
  ]);
  return routes;
}
