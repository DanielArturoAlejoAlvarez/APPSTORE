# APPSTORE
## Description

This repository is a System of sales with JAVA and MySQL.

## Installation
Using JAVA, MySQL preferably.

## DataBase
Using MySQL preferably.

## Usage
```html
$ git clone https://github.com/DanielArturoAlejoAlvarez/APPSTORE.git [NAME APP] 

```
Follow the following steps and you're good to go! Important:


![alt text]()


## Coding

### Models

```java
...
public List listSale() {
        List<Sale> sales = new ArrayList<>();
        String SQL = "SELECT * FROM sales";
        
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()) {
                Sale s = new Sale();
                s.setId(rs.getInt(1));
                s.setIdClient(rs.getInt(2));
                s.setIdUser(rs.getInt(3));
                s.setSerial(rs.getString(4));
                s.setDate(rs.getString(5));
                s.setTotal(rs.getFloat(6));
                s.setState(rs.getBoolean(7));
                
                sales.add(s);
            }
            
        } catch (Exception e) {
        }
        
        return sales;
    }

...

```
### VIEWS

```java
...
void addSale() {
        int idclient = client.getId();
        
        
        int iduser = 1;
        
        String serial = txtSerial.getText();
        String datesale = txtDate.getText();
        float total = totalPayment;
        Boolean state = true;
        
        sale.setIdClient(idclient);
        sale.setIdUser(iduser);
        sale.setSerial(serial);
        sale.setDate(datesale);
        sale.setTotal(total);
        sale.setState(state);
        
        sdao.addSale(sale);
}

void updateStockProduct() {
    for (int i = 0; i < model.getRowCount(); i++) {
        Product prod = new Product();
        idp = Integer.parseInt(tbDetailSale.getValueAt(i, 1).toString());
        qty = Integer.parseInt(tbDetailSale.getValueAt(i, 3).toString());
        
        
        prod = pdao.listID(idp);
        
        int currentStock = prod.getStock() - qty;
        pdao.updateStock(currentStock, idp);            
    }
}

void addDetailSale() {
    String ids = sdao.idSales();
    int idsa = Integer.parseInt(ids);
    
    for (int i = 0; i < tbDetailSale.getRowCount(); i++) {
        int idpro = Integer.parseInt(tbDetailSale.getValueAt(i, 1).toString());
        int qtypro = Integer.parseInt(tbDetailSale.getValueAt(i, 3).toString());
        
        float subtotal = Float.parseFloat(tbDetailSale.getValueAt(i, 4).toString());
        
        ds.setIdProduct(idpro);
        ds.setIdSale(idsa);
        ds.setQty(qtypro);
        ds.setSubtotal(subtotal);
        
        sdao.addDetailSale(ds);
        
    }
    
}
...
```

### Config

```java
...
public void validation() {
    String passEncrypt = encryptPass(txtPassword.getText());
    
    String username = txtUsername.getText();
    //String password = txtPassword.getText();
    
    if(txtUsername.getText().equals("") | txtPassword.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please enter credentials in the form!.");
        txtUsername.requestFocus();
    }else {
        user = udao.validateUser(username, passEncrypt);
        if(user.getUsername() != null && user.getPassword() != null) {
            Principal p = new Principal();                 
            JOptionPane.showMessageDialog(this, "Welcome "+user.getFullname());
                            
            p.setVisible(true);
            dispose();
        }else {
            JOptionPane.showMessageDialog(this, "Please enter a user valid!.");
            txtUsername.requestFocus();
        }
    }
    
}
...
```

## Contributing

Bug reports and pull requests are welcome on GitHub at https://github.com/DanielArturoAlejoAlvarez/APPSTORE. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](http://contributor-covenant.org) code of conduct.


## License

The gem is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).