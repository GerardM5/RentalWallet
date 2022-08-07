import React from "react";
import { useParams } from "react-router-dom";

export default function ProfilePage() {
  const { id } = useParams();
  return <div>ProfilePage del id {id}</div>;
}
