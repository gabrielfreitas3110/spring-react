import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Hello World!</h1>
      </div>
      <DataTable />
      <Footer />
    </>
  );
}

export default App;