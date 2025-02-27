package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ClienteSetDao implements IClienteDAO{

    private Set<Cliente> set;

    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for(Cliente cliente : this.set){
            if(cliente.getCpf().equals(cpf)){
                clienteEncontrado = cliente;
                break;
            }
        }
        if(clienteEncontrado != null){
            this.set.remove(clienteEncontrado);
        }

    }

    @Override
    public void alterar(Cliente cliente) {
        if(this.set.contains(cliente)){
            for(Cliente clienteAlterado: this.set){
                if(clienteAlterado.equals(cliente)){
                    clienteAlterado.setNome(cliente.getNome());
                    clienteAlterado.setTel(cliente.getTel());
                    clienteAlterado.setNumero(cliente.getNumero());
                    clienteAlterado.setEndereco(cliente.getEndereco());
                    clienteAlterado.setCidade(cliente.getCidade());
                    clienteAlterado.setEstado(cliente.getEstado());
                    break;
                }
            }
        }

    }

    @Override
    public Cliente consultar(Long cpf) {
        for(Cliente cliente: this.set){
            if(cliente.getCpf().equals(cpf)){
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
