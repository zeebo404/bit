package org.bearleft.bit.instructions.branch
import org.bearleft.bit.BitCPU
/**
 * User: Eric Siebeneich
 * Date: 3/29/14
 */
class BgteInstruction extends BranchInstruction {

	BgteInstruction() {
		super(1)
	}

	@Override
	void onExecute(BitCPU cpu, int s, int t, def u) {
		branch(cpu.registers[s] >= cpu.registers[t], cpu, u)
	}
}
